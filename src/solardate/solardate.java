package solardate;

import java.util.Calendar;

public class solardate {
	  
	  static int isLeap(int ym){
		  int ly;
	   	if((ym%4)!=0)
		{
			ly = 0;
		}else if((ym%25)!=0){
			
			ly = 1;
			}else if((ym%16)!=0){
			
			ly = 0;
			}else{
			
			ly = 1;
			}
			return ly;
		}
	  
	public static void main(String[] args) {
	   
	    Calendar cal = Calendar.getInstance();
	    int mm = cal.get(Calendar.MONTH)+1;
	    int ym = cal.get(Calendar.YEAR);
	    int dm = cal.get(Calendar.DAY_OF_MONTH);
	    int ds=1;
	    int ms =1;
	    int ys=1370;
	    
		if(isLeap(ym)==1)
		{
		  if(mm==1)
		{
		if(dm>=1 && dm<=20)
		{
			ds= dm+10;
			ms=10;
			ys=ym-622;
		}
		else if(dm>=21 && dm<=31)
		{
			ds= dm - 10;
			ms=11;
			ys=ym-622;
		}
	    }
			else if(mm==2)
		{
		if(dm>=1 && dm<=19)
		{
			ds= dm+11;
			ms=11;
			ys=ym-622;
		}
		else if(dm>=20 && dm<=29)
		{
			ds= dm - 19;
			ms=12;
			ys=ym-622;
		}
	    }
		else if(mm==3)
		{
		if(dm>=1 && dm<=19)
		{
			ds= dm+10;
			ms=12;
			ys=ym-622;
		}
		else if(dm>=20 && dm<=31)
		{
			ds= dm - 19;
			ms=1;
			ys=ym-621;
		}
	    }
	    else if(mm==4)
	    {	
		if(dm>=1 && dm<=19)
		{
			ds= dm+12;
			ms=1;
			ys=ym-621;
		}
		else if(dm>=20 && dm<=30)
		{
			ds= dm - 19;
			ms=2;
			ys=ym-621;
		}
	    }
	      else if(mm==5)
	    {	
		if(dm>=1 && dm<=20)
		{
			ds= dm+11;
			ms=2;
			ys=ym-621;
		}
		else if(dm>=21 && dm<=31)
		{
			ds= dm - 20;
			ms=3;
			ys=ym-621;
		}
	    }
	        else if(mm==6)
	    {	
		if(dm>=1 && dm<=20)
		{
			ds= dm+11;
			ms=3;
			ys=ym-621;
		}
		else if(dm>=21 && dm<=30)
		{
			ds= dm - 20;
			ms=4;
			ys=ym-621;
		}
	    }
	            else if(mm==7)
	    {	
		if(dm>=1 && dm<=21)
		{
			ds= dm+10;
			ms=4;
			ys=ym-621;
		}
		else if(dm>=22 && dm<=31)
		{
			ds= dm - 21;
			ms=5;
			ys=ym-621;
		}
	    }
	            else if(mm==8)
	    {	
		if(dm>=1 && dm<=21)
		{
			ds= dm+10;
			ms=5;
			ys=ym-621;
		}
		else if(dm>=22 && dm<=31)
		{
			ds= dm - 21;
			ms=6;
			ys=ym-621;
		}
	    }
	                else if(mm==9)
	    {	
		if(dm>=1 && dm<=21)
		{
			ds= dm+10;
			ms=6;
			ys=ym-621;
		}
		else if(dm>=22 && dm<=30)
		{
			ds= dm - 21;
			ms=7;
			ys=ym-621;
		}
	    }
	             else if(mm==10)
	    {	
		if(dm>=1 && dm<=21)
		{
			ds= dm+9;
			ms=7;
			ys=ym-621;
		}
		else if(dm>=22 && dm<=31)
		{
			ds= dm - 21;
			ms=8;
			ys=ym-621;
		}
	    }
	             else if(mm==11)
	    {	
		if(dm>=1 && dm<=20)
		{
			ds= dm+10;
			ms=8;
			ys=ym-621;
		}
		else if(dm>=21 && dm<=30)
		{
			ds= dm - 20;
			ms=9;
			ys=ym-621;
		}
	    }
	             else if(mm==12)
	    {	
		if(dm>=1 && dm<=20)
		{
			ds= dm+10;
			ms=9;
			ys=ym-621;
		}
		else if(dm>=21 && dm<=31)
		{
			ds= dm - 20;
			ms=10;
			ys=ym-621;
		}
	    }
	}
	    else if(isLeap(ym-1)==1)
	    {
	            if(mm==1)
	    {	
		if(dm>=1 && dm<=19)
		{
			ds= dm+11;
			ms=10;
			ys=ym-622;
		}
		else if(dm>=20 && dm<=31)
		{
			ds= dm - 19;
			ms=11;
			ys=ym-622;
		}
	    }
	          else if(mm==2)
	    {	
		if(dm>=1 && dm<=18)
		{
			ds= dm+12;
			ms=11;
			ys=ym-622;
		}
		else if(dm>=19 && dm<=28)
		{
			ds= dm - 18;
			ms=12;
			ys=ym-622;
		}
	    }
	           else if(mm==3)
	    {	
		if(dm>=1 && dm<=20)
		{
			ds= dm+10;
			ms=12;
			ys=ym-622;
		}
		else if(dm>=21 && dm<=31)
		{
			ds= dm-20;
			ms=1;
			ys=ym-621;
		}
	    }
	          else if(mm==4)
	    {	
		if(dm>=1 && dm<=20)
		{
			ds= dm+11;
			ms=1;
			ys=ym-621;
		}
		else if(dm>=21 && dm<=30)
		{
			ds= dm-20;
			ms=2;
			ys=ym-621;
		}
	    }
	           else if(mm==5)
	    {	
		if(dm>=1 && dm<=21)
		{
			ds= dm+10;
			ms=2;
			ys=ym-621;
		}
		else if(dm>=22 && dm<=31)
		{
			ds= dm-21;
			ms=3;
			ys=ym-621;
		}
	    }
	        else if(mm==6)
	    {	
		if(dm>=1 && dm<=21)
		{
			ds= dm+10;
			ms=3;
			ys=ym-621;
		}
		else if(dm>=22 && dm<=30)
		{
			ds= dm-21;
			ms=4;
			ys=ym-621;
		}
	    }
	        else if(mm==7)
	    {	
		if(dm>=1 && dm<=22)
		{
			ds= dm+9;
			ms=4;
			ys=ym-621;
		}
		else if(dm>=23 && dm<=31)
		{
			ds= dm-22;
			ms=5;
			ys=ym-621;
		}
	    }
	           else if(mm==8)
	    {	
		if(dm>=1 && dm<=22)
		{
			ds= dm+9;
			ms=5;
			ys=ym-621;
		}
		else if(dm>=23 && dm<=31)
		{
			ds= dm-22;
			ms=6;
			ys=ym-621;
		}
	    }
	             else if(mm==9)
	    {	
		if(dm>=1 && dm<=22)
		{
			ds= dm+9;
			ms=6;
			ys=ym-621;
		}
		else if(dm>=23 && dm<=30)
		{
			ds= dm-22;
			ms=7;
			ys=ym-621;
		}
	    }
	            else if(mm==10)
	    {	
		if(dm>=1 && dm<=22)
		{
			ds= dm+8;
			ms=7;
			ys=ym-621;
		}
		else if(dm>=23 && dm<=31)
		{
			ds= dm-22;
			ms=8;
			ys=ym-621;
		}
	    }
	          else if(mm==11)
	    {	
		if(dm>=1 && dm<=21)
		{
			ds= dm+9;
			ms=8;
			ys=ym-621;
		}
		else if(dm>=22 && dm<=30)
		{
			ds= dm-21;
			ms=9;
			ys=ym-621;
		}
	    }
	          else if(mm==12)
	    {	
		if(dm>=1 && dm<=21)
		{
			ds= dm+9;
			ms=9;
			ys=ym-621;
		}
		else if(dm>=22 && dm<=31)
		{
			ds= dm-21;
			ms=10;
			ys=ym-621;
		}
	    }
	    }
	        else if(isLeap(ym-2)==1)
	    {
	            if(mm==1)
	    {	
		if(dm>=1 && dm<=20)
		{
			ds= dm+10;
			ms=10;
			ys=ym-622;
		}
		else if(dm>=21 && dm<=31)
		{
			ds= dm - 20;
			ms=11;
			ys=ym-622;
		}
	    }
	          else if(mm==2)
	    {	
		if(dm>=1 && dm<=19)
		{
			ds= dm+11;
			ms=11;
			ys=ym-622;
		}
		else if(dm>=20 && dm<=28)
		{
			ds= dm - 19;
			ms=12;
			ys=ym-622;
		}
	    }
	           else if(mm==3)
	    {	
		if(dm>=1 && dm<=20)
		{
			ds= dm+9;
			ms=12;
			ys=ym-622;
		}
		else if(dm>=21 && dm<=31)
		{
			ds= dm-20;
			ms=1;
			ys=ym-621;
		}
	    }
	          else if(mm==4)
	    {	
		if(dm>=1 && dm<=20)
		{
			ds= dm+11;
			ms=1;
			ys=ym-621;
		}
		else if(dm>=21 && dm<=30)
		{
			ds= dm-20;
			ms=2;
			ys=ym-621;
		}
	    }
	           else if(mm==5)
	    {	
		if(dm>=1 && dm<=21)
		{
			ds= dm+10;
			ms=2;
			ys=ym-621;
		}
		else if(dm>=22 && dm<=31)
		{
			ds= dm-21;
			ms=3;
			ys=ym-621;
		}
	    }
	        else if(mm==6)
	    {	
		if(dm>=1 && dm<=21)
		{
			ds= dm+10;
			ms=3;
			ys=ym-621;
		}
		else if(dm>=22 && dm<=30)
		{
			ds= dm-21;
			ms=4;
			ys=ym-621;
		}
	    }
	        else if(mm==7)
	    {	
		if(dm>=1 && dm<=22)
		{
			ds= dm+9;
			ms=4;
			ys=ym-621;
		}
		else if(dm>=23 && dm<=31)
		{
			ds= dm-22;
			ms=5;
			ys=ym-621;
		}
	    }
	           else if(mm==8)
	    {	
		if(dm>=1 && dm<=22)
		{
			ds= dm+9;
			ms=5;
			ys=ym-621;
		}
		else if(dm>=23 && dm<=31)
		{
			ds= dm-22;
			ms=6;
			ys=ym-621;
		}
	    }
	             else if(mm==9)
	    {	
		if(dm>=1 && dm<=22)
		{
			ds= dm+9;
			ms=6;
			ys=ym-621;
		}
		else if(dm>=23 && dm<=30)
		{
			ds= dm-22;
			ms=7;
			ys=ym-621;
		}
	    }
	            else if(mm==10)
	    {	
		if(dm>=1 && dm<=22)
		{
			ds= dm+8;
			ms=7;
			ys=ym-621;
		}
		else if(dm>=23 && dm<=31)
		{
			ds= dm-22;
			ms=8;
			ys=ym-621;
		}
	    }
	          else if(mm==11)
	    {	
		if(dm>=1 && dm<=21)
		{
			ds= dm+9;
			ms=8;
			ys=ym-621;
		}
		else if(dm>=22 && dm<=30)
		{
			ds= dm-21;
			ms=9;
			ys=ym-621;
		}
	    }
	          else if(mm==12)
	    {	
		if(dm>=1 && dm<=21)
		{
			ds= dm+9;
			ms=9;
			ys=ym-621;
		}
		else if(dm>=22 && dm<=31)
		{
			ds= dm-21;
			ms=10;
			ys=ym-621;
		}
	    }
	    }
	         else if(isLeap(ym-3)==1)
	    {
	            if(mm==1)
	    {	
		if(dm>=1 && dm<=20)
		{
			ds= dm+10;
			ms=10;
			ys=ym-622;
		}
		else if(dm>=21 && dm<=31)
		{
			ds= dm - 20;
			ms=11;
			ys=ym-622;
		}
	    }
	          else if(mm==2)
	    {	
		if(dm>=1 && dm<=19)
		{
			ds= dm+11;
			ms=11;
			ys=ym-622;
		}
		else if(dm>=20 && dm<=28)
		{
			ds= dm - 19;
			ms=12;
			ys=ym-622;
		}
	    }
	           else if(mm==3)
	    {	
		if(dm>=1 && dm<=20)
		{
			ds= dm+9;
			ms=12;
			ys=ym-622;
		}
		else if(dm>=21 && dm<=31)
		{
			ds= dm-20;
			ms=1;
			ys=ym-621;
		}
	    }
	          else if(mm==4)
	    {	
		if(dm>=1 && dm<=20)
		{
			ds= dm+11;
			ms=1;
			ys=ym-621;
		}
		else if(dm>=21 && dm<=30)
		{
			ds= dm-20;
			ms=2;
			ys=ym-621;
		}
	    }
	           else if(mm==5)
	    {	
		if(dm>=1 && dm<=21)
		{
			ds= dm+10;
			ms=2;
			ys=ym-621;
		}
		else if(dm>=22 && dm<=31)
		{
			ds= dm-21;
			ms=3;
			ys=ym-621;
		}
	    }
	        else if(mm==6)
	    {	
		if(dm>=1 && dm<=21)
		{
			ds= dm+10;
			ms=3;
			ys=ym-621;
		}
		else if(dm>=22 && dm<=30)
		{
			ds= dm-21;
			ms=4;
			ys=ym-621;
		}
	    }
	        else if(mm==7)
	    {	
		if(dm>=1 && dm<=22)
		{
			ds= dm+9;
			ms=4;
			ys=ym-621;
		}
		else if(dm>=23 && dm<=31)
		{
			ds= dm-22;
			ms=5;
			ys=ym-621;
		}
	    }
	           else if(mm==8)
	    {	
		if(dm>=1 && dm<=22)
		{
			ds= dm+9;
			ms=5;
			ys=ym-621;
		}
		else if(dm>=23 && dm<=31)
		{
			ds= dm-22;
			ms=6;
			ys=ym-621;
		}
	    }
	             else if(mm==9)
	    {	
		if(dm>=1 && dm<=22)
		{
			ds= dm+9;
			ms=6;
			ys=ym-621;
		}
		else if(dm>=23 && dm<=30)
		{
			ds= dm-22;
			ms=7;
			ys=ym-621;
		}
	    }
	            else if(mm==10)
	    {	
		if(dm>=1 && dm<=22)
		{
			ds= dm+8;
			ms=7;
			ys=ym-621;
		}
		else if(dm>=23 && dm<=31)
		{
			ds= dm-22;
			ms=8;
			ys=ym-621;
		}
	    }
	          else if(mm==11)
	    {	
		if(dm>=1 && dm<=21)
		{
			ds= dm+9;
			ms=8;
			ys=ym-621;
		}
		else if(dm>=22 && dm<=30)
		{
			ds= dm-21;
			ms=9;
			ys=ym-621;
		}
	    }
	          else if(mm==12)
	    {	
		if(dm>=1 && dm<=21)
		{
			ds= dm+9;
			ms=9;
			ys=ym-621;
		}
		else if(dm>=22 && dm<=31)
		{
			ds= dm-21;
			ms=10;
			ys=ym-621;
		}
	    }
	    }
	  
String mss="";
	    if (ms == 1){
			mss="Farvardin";
			}
		else if (ms == 2){
			mss="Ordibehesht";
			}
		else if (ms == 3){
			mss="Khordad";
			}
			else if (ms == 4){
			mss="Tir";
			}
			else if (ms == 5){
			mss= "Mordad";
			}
			else if (ms == 6){
			mss= "Shahrivar";
			}
			else if (ms == 7){
			mss= "Mehr";
			}
			else if (ms == 8){
			mss= "Aban";
			}
			else if (ms == 9){
			mss= "Azar";
			}
			else if (ms == 10){
			mss= "Dey";
			}
			else if (ms == 11){
			mss="Bahman";
			}
			else if (ms == 12){
			mss= "Esfand";
			}
			
	    
	    System.out.printf("%s %d, %d AP\n",mss,ds,ys);

	}

}
