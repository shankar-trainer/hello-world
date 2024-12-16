package com.ttknpdev.understandhowtoworkwithangular.entities.many;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ttknpdev.understandhowtoworkwithangular.entities.one.Employee;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aid")
    private Long _aid;
    /*
    -- the @JoinColumn annotation to specify the foreign key column (eid).
    -- If you don’t provide the JoinColumn name, the name will be set automatically.
    -- @JsonIgnore is used to ignore the logical property used in serialization and deserialization.
    */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eid")
    @JsonIgnore
    private Employee employee; // for create
    @Column(name = "city")
    private String _city;
    @Column(name = "country")
    private String _country;
    @Column(name = "details")
    private String _details;

    public Address(Long aid, String city, String country, String details) {
        this._aid = aid;
        this._city = city;
        this._country = country;
        this._details = details;
    }

    @Override
    public String toString() {
        return "Address{" +
                "_aid=" + _aid +
                ", _city='" + _city + '\'' +
                ", _country='" + _country + '\'' +
                ", _details='" + _details + '\'' +
                '}';
    }
}
