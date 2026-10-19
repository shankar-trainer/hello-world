for i in {1..50};
do
		/opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P @Potter77 -d master -Q "CREATE DATABASE order-service"
    if [ $? -eq 0 ]
    then
        echo "Database created"
        break
    else
        echo "not ready yet..."
        sleep 1
    fi
done