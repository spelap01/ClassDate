class Date{
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
