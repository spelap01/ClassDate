package es.unileon.prg1;
public class Date{
    private int day;
    private int month;
    private int year;
    
    public Date(int day, int month, int year){
	if (day<=0||day>=31){
		System.out.println("error");
	}
	else if(month<=0||month>=12){
		System.out.ptintln("error");
	}
	else if(year<=0){
		System.out.ptintln("error");
	}
	
        this.day= day;
        this.month= month;
        this.year= year;
    }
    
    int getDay(){
        return this.day;
    }
    void setDay(int day){
        this.day= day;
    
    }
    
    int getMonth(){
        return this.month;
    }
    void setMonth(int month){
        this.month= month;
    }
    
    int getYear(){
        return this.year;
    }
    void setYear(int year){
        this.year= year;
    }
    
    boolean isSameYear(Date otherDate){
        boolean result = false;
        if(this.year==otherDate.getYear()){
            result=true;
        }
        return result;
    }
    
    
    boolean isSameMonth(Date otherDate){
        boolean result = false;
        if(this.month==otherDate.getMonth()){
            result=true;
        }
        return result;
    }
    
    
    boolean isSameYear(Date otherDate){
        boolean result = false;
        if(this.day==otherDate.getDay()){
            result=true;
        }
        return result;
    }

    boolean is same(Date otherDate){
        boolean result= false;
        if(isSameDay(otherDate)==true&&isSameMonth(otherDate)==true&&isSameYear(otherDate)==true){
               result= true;
            }else{
                result= false;
        }
}

String getMonthName(){ 		
	String mes= new String(" ");
	switch (month){
		case 1: 
			mes="Enero";
			break;
		case 2:
			mes="Febrero";
			break;
		case 3:
			mes="Marzo";
			break;
		case 4:
			mes="Abril";
			break;
		case 5:
			mes="Mayo";
			break;
		case 6:
			mes="Junio";
			break;
		case 7:
			mes="Julio";
			break;
		case 8:
			mes="agosto";
			break;
		case 9:
			mes="Septiembre";
			break;
		case 10:
			mes="octubre";
			break;
		case 11:
			mes="Noviembre";
			break;
		case 12:		
			mes="Diciembre";
			break;
	}
}

String getSpringName(){
	String estacion= new String("");
	switch(month){ 
		case 1: 
			mes="invierno";
			break;
		case 2:
			mes="invierno";
			break;
		case 3:
			mes="primavera";
			break;
		case 4:
			mes="primavera";
			break;
		case 5:
			mes="primavera";
			break;
		case 6:
			mes="primavera";
			break;
		case 7:
			mes="verano";
			break;
		case 8:
			mes="verano";
			break;
		case 9:
			mes="verano";
			break;
		case 10:
			mes="otoño";
			break;
		case 11:
			mes="otoño";
			break;
		case 12:		
			mes="invierno";
			break;
	}
}
















		







