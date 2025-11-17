package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@Data

@AllArgsConstructor
@NoArgsConstructor
@RedisHash(value = "Customer")
public class Customer {

    @Id
    @Indexed
    private int id; // "indexed" for faster retrieval,
                    // @Id for marking this field as the key
    private String name;
    private long phone;
    private String email;
}