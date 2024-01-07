legacy behavior
We set spring.jpa.properties.hibernate.column_ordering_strategy=legacy


Hibernate generates columns in alphabetical order.


Hibernate 6.2 intoduced the ColumnOrderingStrategy interface. 
The default strategy is now the ColumnOrderingStrategyStandard.