package com.sgtest.AbstractAssignment;
class Data 
{  
    int aa = 5;
    private class Record 
    { 
        void display() 
        { 
            System.out.println("result of private inner class ="+aa);
        } 
    } 
    void methodOfData()
    {
        Record rec = new Record();
        rec.display();
    }
} 
public class AbstractNestedPrivate {
	public static void main(String[] args) {
		 Data data = new Data();
	     data.methodOfData();
	}
}
