package aaaaaa;
import java.util.*;

public class Rastreamento {

	  public static void main(String[] args) {
	    Scanner numeros = new Scanner(System.in);
	    Scanner frases = new Scanner(System.in);
	    
	    int N = 0, C = 0, E = 0, T = 0;
	    String S;
	    
	    ArrayList<String> bugs = new ArrayList<String>();
	    ArrayList<Integer> times = new ArrayList<Integer>();
	    
	    //(0 <= N <= 100)
	    N = obterOperacoes();
	    
	    for (int i=0; i < N; i++) {
	      
	      //(C == 0 || C == 1)
	      C = numeros.nextInt();
	      
	      switch(C) {
	          
	        case 0: S = frases.nextLine();
	                E = numeros.nextInt();
	                bugs.add(S);
	                times.add(E); break;
	      
	        case 1: try {
		        		T = numeros.nextInt();
		        		E = times.get(0);
			                if (E - T > 0) {
			                  E = E - T;
			                  S = bugs.get(0);
			                  bugs.remove(0);
			                  times.remove(0);
			                  bugs.add(S);
			                  times.add(E);
			                } else {
			                  bugs.remove(0);
			                  times.remove(0);
			                }
	        		} catch (IndexOutOfBoundsException e) {
	        			bugs.add("Não existem bugs cadastrados");
		                times.add(null);
	        		}
	        
	                break;

	        default: return;
	      
	      }
	      
	    }
	    
	    try {
	    	bugs.get(0);
	    	for (int i=0; i < bugs.size(); i++) {
		    	if(times.get(i)==null) {
		    		System.out.println(bugs.get(i));
		    	} else {
		    		System.out.println(bugs.get(i) + " " + times.get(i));
		    	}
		    }
	    } catch (IndexOutOfBoundsException e) {
	    	System.out.println("Lista vazia");
	    }
	      	  
	  }

	  private static int obterOperacoes() {
	    Scanner numero = new Scanner(System.in);
	    int N = numero.nextInt();
	    if (N>=0 && N <= 100){
	      return N;
	    }
	    return 0;
	  }
	  
	}
