package collectionFramework;

public class Student {
private String name;
private String address;
private String mobileNumber;
private int fee;

public int getFee() {
	return fee;
}
public void setFee(int fee) {
	this.fee = fee;
}
public String getName()
{
	return name;
}
public void setName(String name)
{
	this.name=name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String mobileNumber()
{
	return mobileNumber;
}
public void mobileNumber(String mobileNumber)
{
	this.mobileNumber=mobileNumber;
}
public Student()
{
	
}
public Student(String name,String address,String mobileNumber,int fee) {
	this.name=name;
	this.address=address;
	this.mobileNumber=mobileNumber;
	this.fee=fee;
}
}
