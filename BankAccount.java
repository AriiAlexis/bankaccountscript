/*Create BankAccount class with the following features: 
acctNum,acctType, acctBalance, acctPin
Methods: Setters,getters, two overload contructors, 
showAccount(), deposit(), withdraw()*/ 

//Class design 
public class BankAccount{
//define the properties 
private int acctNum; 
private String acctType; 
private double acctBalance; 
private int acctPin;
 
//setters for acctNum
/*setter will set value to the class property. 
its argument will be the value to be set and
a setter does not return anything
So, it is a void method*/ 

public void setAcctNum(int x){

this.acctNum = x; 
}

//getter for acctNum 
/*getter will get (return) the value of the property. 
it does not take arguments. Its return data type 
is of that of the property.*/

public int getAcctNum(){
return this.acctNum; 
}

//setter for acctType 
public void setAcctType(String s){
this.acctType = s; 
}

//getter for acctType 
 public String getAcctType(){
 return this.acctType;
 } 
 
 //setter for acctBalance 
 public void setAcctBalance(double y){
 this.acctBalance = y;
 }
 
 //getter for acctBalance 
 public double getAcctBalance(){
 return this.acctBalance;
 } 
 
 //setter for acctPin
 public void setAcctPin(int p){
 this.acctPin = p;
 }
 //getter for acctPin  
  public int getAcctPin(){
  return this.acctPin; 
  }
 //Constructor with out parameters 
 public BankAccount(){
 this.acctNum = 0; 
 this.acctType = ""; 
 this.acctPin = 0; 
 this.acctBalance = 0.0; 
 }
//constructor 
public BankAccount(int acctNum, double acctBalance, int acctPin, String acctType)
{
this.acctNum = acctNum;
this.acctPin = acctPin;
this.acctType = acctType; 
this.acctBalance = acctBalance;
}

//overloaded constructor 
public BankAccount(String acctType , int acctNum, double acctBalance, int acctPin)
{
this.acctNum = acctNum;
this.acctPin = acctPin;
this.acctType = acctType; 
this.acctBalance = acctBalance;
}
 
//overloaded constructor 
public BankAccount(int acctPin, String acctType , int acctNum, double acctBalance)
{
this.acctNum = acctNum;
this.acctPin = acctPin;
this.acctType = acctType; 
this.acctBalance = acctBalance;
}

//overloaded constructor 
public BankAccount(double acctBalance, int acctPin, String acctType , int acctNum)
{
this.acctNum = acctNum;
this.acctPin = acctPin;
this.acctType = acctType; 
this.acctBalance = acctBalance;
}
//showAccount()
public String showBankAccount(){
return "Acct Number: " + this.acctNum + "balance: " + this.acctBalance + "account type: "+ this.acctType + " pin " + this.acctPin; 
}//end of showAccount()

//deposit()
public double deposit(double amount){
this.acctBalance += amount; 
return this.acctBalance; 
}
 
//withdraw()
public String withdraw( double amount){
//minimum balance is $1,000
if (this.acctBalance >1000+amount){
this.acctBalance -= amount; 
return "updated balace after withdraw: "+this.acctBalance;
}
else 
return "Insuffiencent funds.Withdraw cannot be done.";  
}//end of withdraw 


}//end of class 

