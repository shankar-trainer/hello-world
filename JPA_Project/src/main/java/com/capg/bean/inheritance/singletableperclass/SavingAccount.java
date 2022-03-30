package com.capg.bean.inheritance.singletableperclass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "saving")
public class SavingAccount  extends Account{

}
