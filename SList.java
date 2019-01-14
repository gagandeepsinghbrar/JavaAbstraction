// Submitted By: Gagandeep S Brar 

import java.util.ArrayList;

class EmptySListException extends RuntimeException {
	 public EmptySListException(String s) {
	  super(s);
	 }
	}
	public class SList <E> {
		
		private ArrayList<E> stack ;
		
		
		//add private data members and methods as needed 
		
		
		public SList ()    {  
			stack = new ArrayList<E>();
			
		}       

		public int length()  {
			
			return stack.size();
			
			
		}   
	
		public boolean isEmpty() {
			
			return (stack.size() == 0);
			
			
			
		}  
		
		public E head() throws EmptySListException{  
			
			if(stack.isEmpty()) {
	               throw new EmptySListException(" There is no head to display");
			}
	          else {
	        	  return stack.get(0);
	          }
			
			
			
		}      

		
		public SList<E> tail()    { 
			
			SList<E> tempList = new SList<E>();
			ArrayList<E> newList = new ArrayList<E>();
			
			for(E p : stack) {
			    newList.add(p);
			}
			newList.remove(0);
			tempList.stack=newList;
			
			
			return tempList;
			
			
			
		}  
		
		
		public SList<E> cons( E item)  {
			SList<E> tempList = new SList<E>();
			tempList.stack=this.stack;
			tempList.stack.add(0,item);
			return tempList;
			
			
		}
		public String toString() {  
			if(stack.isEmpty()) {
				return "[ ]";
			}
			else {
				String mystring = "[";

				for (int i=0;i<stack.size();i++)
				{
					
					if(i==stack.size()-1) {
						
						mystring += stack.get(i)+"]";
					}
					else {
						
				    mystring += stack.get(i) + ",";
					}
				}
				
				return mystring;
				
				
				
			}
			
		}
				
		}
		   
	
	