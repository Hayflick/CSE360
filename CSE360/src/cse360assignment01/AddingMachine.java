package cse360assignment01;

import java.io.*;
import java.util.*;


/*
 *The AddingMachine program implements an application that allows for basic arithmetic 
 *operations such as addition and attraction using integer values, as well as the
 *returning of the result of these operations and a method to display the result
 *via standard output.
 *
 * @author Aria Salehi
 * @version 1.0
 * @since 10/4/2020
 */

public class AddingMachine {
	
  private int total;	//	variable returned to user containing total of the operations performed
  private ArrayList<String> history = new ArrayList<String>();	//	list that records all operations
  private String summary = "";	// string representation of ArrayList
  
  //Constructor that initializes class variable total to 0 and adds a 0 to the beginning of history
  public AddingMachine () {
	  
    total = 0;
    history.add("0");
  
  }
  
  //Function that returns the total class variable
  public int getTotal () {
	  
    return total;
  
  }
  
  /*
   *Function that adds integer values to the total class variable and makes a record of the
   *operation in the history ArrayList
  */
  public void add (int value) {
	  
	  total = total + value;
	  
	  history.add("+");
	  history.add(Integer.toString(value));
  
  }

  /*
   * Function that subtracts integer values from the total class variable and makes a record of the
   * operation in the history ArrayList
  */
  public void subtract (int value) {
  
	  total = total - value;
	  
	  history.add("-");
	  history.add(Integer.toString(value));
  }

  //Function returning string representation of the history of operations performed via ArrayList
  public String toString () {
	  
	  for(int i = 0; i < history.size(); i++)
	  {
		  summary = summary + (history.get(i) + " ");
	  }
	  
	  return summary;
  
  }

  /*
   * Function clears memory of all previous operations from the ArrayList, resets the value of
   * summary, and resetting the total value to 0.
   * */
  public void clear() {
	  
	  total = 0;
	  history.clear();
	  summary = "";
	  
  }
}