for i in {1..50};
do
    psql -h localhost -p 5432 -U postgres -d postgres -f schema.sql
    if [ $? -eq 0 ]
    then
        echo "schema.sql completed"
        break
    else
        echo "not ready yet..."
        sleep 1
    fi
done