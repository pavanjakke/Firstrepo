package com.zensar.bean;



import java.util.ArrayList;
import java.util.List;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;



@Entity
@Table(name="employee")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int empId;

@Column
String name;

@Column
double basicSalary;

@OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
@PrimaryKeyJoinColumn
Address address;

@OneToOne(cascade = CascadeType.ALL)
@JoinTable(name="employee_bankAccount",
joinColumns = @JoinColumn(name="empId",referencedColumnName = "empId"),
inverseJoinColumns = @JoinColumn(name="bankId",referencedColumnName = "bankId",unique = true))
BankAccount account;



@OneToOne(cascade = CascadeType.ALL)
@JoinTable(name="employee_skillLevel",
joinColumns = @JoinColumn(name="empId",referencedColumnName = "empId"),
inverseJoinColumns = @JoinColumn(name="skillLevel",referencedColumnName = "skillLevel",unique = true))

List<Skill> skillList;

private void init() {
if(this.skillList==null)
this.skillList=new ArrayList<Skill>();
}



public Employee() {
super();
init();
}



public Employee(int empId) {
super();
this.empId = empId;
init();



}





public Employee(int empId, String name) {
super();
this.empId = empId;
this.name = name;
init();



}



public Employee(String name, double basicSalary, Address address) {
super();
this.name = name;
this.basicSalary = basicSalary;
this.address = address;
init();



}



public Employee(String name, double basicSalary, Address address, List<Skill> skillList, BankAccount account) {
super();
this.name = name;
this.basicSalary = basicSalary;
this.address = address;
this.skillList = skillList;
this.account = account;
init();



}



public Employee(int empId, String name, double basicSalary, Address address, List<Skill> skillList,
BankAccount account) {
super();
this.empId = empId;
this.name = name;
this.basicSalary = basicSalary;
this.address = address;
this.skillList = skillList;
this.account = account;
init();



}



public int getEmpId() {
return empId;
}



public void setEmpId(int empId) {
this.empId = empId;
}



public String getName() {
return name;
}



public void setName(String name) {
this.name = name;
}



public double getBasicSalary() {
return basicSalary;
}



public void setBasicSalary(double basicSalary) {
this.basicSalary = basicSalary;
}



public Address getAddress() {
return address;
}



public void setAddress(Address address) {
this.address = address;
}



public List<Skill> getSkillList() {
return skillList;
}



public void setSkillList(List<Skill> skillList) {
this.skillList = skillList;
}



public BankAccount getAccount() {
return account;
}



public void setAccount(BankAccount account) {
this.account = account;
}



@Override
public String toString() {
return "Employee [empId=" + empId + ", name=" + name + ", basicSalary=" + basicSalary + ", address=" + address
+ ", skillList=" + skillList + ", account=" + account + "]";
}
}

