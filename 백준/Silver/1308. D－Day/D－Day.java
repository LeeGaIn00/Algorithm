import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    int Tyear = Integer.parseInt(st.nextToken());
        int Tmonth = Integer.parseInt(st.nextToken());
        int Tday = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
	    
	    int Dyear = Integer.parseInt(st.nextToken());
        int Dmonth = Integer.parseInt(st.nextToken());
        int Dday = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();

        int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int count = 0;
        
        if(Tyear + 1000 < Dyear 
            || (Tyear + 1000 == Dyear && Tmonth < Dmonth)
	        || (Tyear + 1000 == Dyear && Tmonth == Dmonth && Tday <= Dday))
            sb.append("gg");
            
        else {
            for(int year = Tyear + 1; year < Dyear; year++) {
                // 윤년
                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                    count += 366;
                else 
                    count += 365;
            }
            // 시작, 종료 년도 같을 때
            if(Tyear == Dyear) {
                if(Tmonth == Dmonth)
                    count += Dday - Tday;
                    
                else  {
                    for(int month = Tmonth + 1; month < Dmonth; month++)
                        count += day[month];
                    
                    if((Tmonth > 1 && Dmonth > 2) 
                        && ((Tyear % 4 == 0 && Tyear % 100 != 0) || (Tyear % 400 == 0)))
                        count++; // 윤년
                    
                    count += (day[Tmonth] - Tday);
                    count += Dday;
                }
                
            }
            // 시작, 종료 년도 다를 때
            else {
                // 월
                for(int month = Tmonth + 1; month <= 12; month++) 
                    count += day[month];
                    
                for(int month = 1; month < Dmonth; month++) 
                    count += day[month];
                 
                // 윤년 계산    
                if((Tmonth <= 2) 
                    && ((Tyear % 4 == 0 && Tyear % 100 != 0) || (Tyear % 400 == 0)))
                    count++; // 윤년
                
                if((Dmonth >= 3) 
                    && ((Dyear % 4 == 0 && Dyear % 100 != 0) || (Dyear % 400 == 0)))
                    count++; // 윤년
                
                count += (day[Tmonth] - Tday);
                count += Dday; 
            }
            sb.append("D-" + count);
        }

        System.out.print(sb);
	}
}