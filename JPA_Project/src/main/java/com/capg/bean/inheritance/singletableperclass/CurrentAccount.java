package com.capg.bean.inheritance.singletableperclass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "current")

public class CurrentAccount  extends Account{

}
