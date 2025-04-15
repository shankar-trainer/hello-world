Serialization

   Employee emp1=new Employee();
   emp1.setId(10001);
   emp1.setName("raj kumar");

   write to the file

   it will work with object

  ObjectInputStream -- read file having objects
  ObjectOutputStream  -- write object to the file

  ObjectInputStream    -- read the object using readObject() method
                       -- deserialization
                       -- read the state of the object, retrieve the object

  ObjectOutputStream  -- write object to the file using writeObject method
             it makes the serialization (save the state of the object to the file)



        Serialization -- Serialization +Deserialization
                           writing         reading
        transient      -- attribute not to serialise

        static and transient will not be serialized









   ========

   Byte Stream  -- read and write using bytes
   Character Stream  --read and write using characters








