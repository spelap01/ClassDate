package es.unileon.prg1;
public class Date{
    private int day;
    private int month;
    private int year;
    //laza el exception si da error 


    public Date(int day, int month, int year)throws DateException{
	StringBuffer message= new StringBuffer();
	if (day<=0||day>31){
		message.append("error");
	}
	if(month<=0||month>12){
		message.append("error");
	} 
	if(year<=0){
		message.append("error");
	}
			
	if (message.length()!=0){
		throw new DateException(message.toString()); 
      }else{
	this.day=day;
	this.month=month;
	this.year=year;
    }
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
    
    boolean isSameDay(Date otherDate){
        boolean result = false;
        if(this.day==otherDate.getDay()){
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
        if(this.year==otherDate.getYear()){
            result=true;
        }
        return result;
    }

   
    boolean isSame(Date another){
        boolean result= false;
        if(isSameDay(another)==true&&isSameMonth(another)==true&&isSameYear(another)==true){
               result= true;
            }
               return result;
}
	
String getMonthName(){
	String mes= new String(" ");
	switch(month){
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
		mes="Agosto";
		break;
		case 9: 
		mes="Septiembre";
		break;
		case 10: 
		mes="Noviembre";
		break;
		case 11: 
		mes="Octubre";
		break;
		case 12: 
		mes="Diciembre";
		break;
	}
}
String getSeasonName(){
	String estacion= new String(" ");
	switch(month){
		case 1: 
		estacion="invierno";
		break;
		case 2: 
		estacion="invierno";
		break;
		case 3: 
		if(day<=21){
			estacion="invierno";
		}else{
			estacion="primavera";
		}
		break;
		case 4: 
		estacion="primavera";
		break;
		case 5: 
		estacion="primavera";
		break;
		case 6: 
		if(day<=21){
			estacion="primavera";
		}else{
			estacion="verano";
		}
		break;
		case 7: 
		estacion="verano";
		break;
		case 8: 
		estacion="verano";
		break;
		case 9: 
		if(day<=23){
			estacion="verano";
		}else{
			estacion="otoño";
		}
		break;
		case 10: 
		estacion="otoño";
		break;
		case 11: 
		estacion="otoño";
		break;
		case 12: 
		if(day<=21){
			estacion="otoño";
		}else{
			estacion="invierno";
		}
		break;
		
	}
}


int getRestOfMonths(){
	for(int i=month;i<12;i++){
	System.out.println("los mese restantes son"+i);
	}
}	

String correctDay()throws DateException{	
	String mensage=message.append("error");
	switch(month){
		case 1:
		if(day<0||day>31){
			String mensage=message.append("error");
		}
		break;
		case 2:
		if(day<0||day>28){
			String mensage=message.append("error");
		}		
		break;
		case 3:
		if(day<0||day>31){
			String mensage=message.append("error");
		}		
		break;
		case 4:
		if(day<0||day>30){
			String mensage=message.append("error");
		}		
		break;
		case 5:
		if(day<0||day>31){
			String mensage=message.append("error");
		}		
		break;
		case 6:
		if(day<0||day>30){
			String mensage=message.append("error");
		}		
		break;
		case 7:
		if(day<0||day>31){
			String mensage=message.append("error");
		}		
		break;
		case 8:
		if(day<0||day>31){
			String mensage=message.append("error");
		}		
		break;
		case 9:
		if(day<0||day>30){
			String mensage=message.append("error");
		}		
		break;
		case 10:
		if(day<0||day>31){
			String mensage=message.append("error");
		}		
		break;
		case 11:
		if(day<0||day>30){
			String mensage=message.append("error");
		}		
		break;
		case 12:
		if(day<0||day>31){
			String mensage=message.append("error");
		}		
		break;
	}


}
int printDate(){
	for(int i=0;i<3;i++){
	if(i==1){
	System.out.println("el dia"+day);
	}
	if(i==2){
	System.out.println("del mes"+month);
	}
	if(i==3){
	System.out.println("de"+year);
	}
	}
}






