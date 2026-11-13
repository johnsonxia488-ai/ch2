public static class Stats.java
 public static void main(String[] args) {
	 if (args.length == 0) {
		 System.err.println(""); 
		 return; 
	 }
	 int max = Integer.MIN_VALUE;
	 int min = Integer.MAX_VALUE;
	 int count = args.length; 
	 int sum = 0; 
	 
     for (String arg : args) {
     int value = Integer.parseInt(arg);
     sum += value; 
     
     if (value > max) {
		 max = value; 
	 }
	 if (value < min) {
		 min = value; 	 
    }
}
double average = double sum / count; 
System.out.println("Count" + count);
System.out.println("Sum" + sum); 
System.out.println("Min" + min); 
Systen.out.println("Max" + max); 
System.out.println("Average" + average); 
}
}
