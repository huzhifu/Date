import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Dat {
	
 public static void main(String[] args){
	 Date d=new Date();
	 SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd��E hh:mm:ss");
	 String time = sdf.format(d);
	 //��һ�ַ���
	 System.out.println(d);
	 System.out.println(time);
	 //�ڶ��ַ���
	 long time1 = System.currentTimeMillis();
	 Date d1=new Date(time1);
	 System.out.println(d1);
	//�����ַ���
	 Calendar calendar = Calendar.getInstance();
	 System.out.println("=============");
	 System.out.println(calendar);
	 System.out.println(calendar.get(Calendar.YEAR)+"-"+(calendar.get(Calendar.MONTH)+1)+"-"+calendar.get(Calendar.DATE)+"-"+calendar.get(Calendar.HOUR_OF_DAY)+"-"
			 +calendar.get(Calendar.MINUTE)+"-"+calendar.get(Calendar.SECOND));
 }
}
