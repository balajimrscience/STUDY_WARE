package com.course.Mr_Science.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.course.Mr_Science.Model.Test;

@Service
public class FilterServiceImpl implements FilterService {

	@Override
	public List<Test> filterTest(int code, List<Test> fullList) {
		
		
		List<Test> selectedTest = new ArrayList<>();
		
		if(code == 901)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==9)
				{
					selectedTest.add(itr);
				}
			}
		}
		else if(code == 902)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==9 && itr.getSubject_name()=="English")
				{
					selectedTest.add(itr);
				}
			}
		}
		else if(code == 903)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==9 && itr.getSubject_name()=="Maths")
				{
					selectedTest.add(itr);
				}
			}
		}
		else if(code == 904)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==9 && itr.getSubject_name()=="Science")
				{
					selectedTest.add(itr);
				}
			}
			
		}
		else if(code == 905)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==9 && itr.getSubject_name()=="Social")
				{
					selectedTest.add(itr);
				}
			}
		}
		
		
		//========================================================================
		//========================================================================
		
		
		
		
		else if(code == 1001)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==10)
				{
					selectedTest.add(itr);
				}
			}
			
		}
		else if(code == 1002)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==10 && itr.getSubject_name()=="English")
				{
					selectedTest.add(itr);
				}
			}
		}
		else if(code == 1003)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==10 && itr.getSubject_name()=="Maths")
				{
					selectedTest.add(itr);
				}
			}
		}
		else if(code == 1004)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==10 && itr.getSubject_name()=="Science")
				{
					selectedTest.add(itr);
				}
			}
			
		}
		else if(code == 1005)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==10 && itr.getSubject_name()=="Social")
				{
					selectedTest.add(itr);
				}
			}
		}
		
		//=========================================
		//=========================================
		
		
		else if(code == 1101)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==11)
				{
					selectedTest.add(itr);
				}
			}
			
		}
		else if(code == 1102)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==11 && itr.getSubject_name()=="Physics")
				{
					selectedTest.add(itr);
				}
			}
		}
		else if(code == 1103)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==11 && itr.getSubject_name()=="Chemistry")
				{
					selectedTest.add(itr);
				}
			}
		}
		else if(code == 1104)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==11 && itr.getSubject_name()=="Biology")
				{
					selectedTest.add(itr);
				}
			}
			
		}
		else if(code == 1105)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==11 && itr.getSubject_name()=="Botany")
				{
					selectedTest.add(itr);
				}
			}
		}
		else if(code == 1106)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==11 && itr.getSubject_name()=="Zoology" )
				{
					selectedTest.add(itr);
				}
			}
			
		}
		else if(code == 1107)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==11 && itr.getSubject_name()=="Commerce")
				{
					selectedTest.add(itr);
				}
			}
		}
		else if(code == 1108)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==11 && itr.getSubject_name()=="Accounts")
				{
					selectedTest.add(itr);
				}
			}
		}
		else if(code == 1109)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==11 && itr.getSubject_name()=="Buisness_Maths")
				{
					selectedTest.add(itr);
				}
			}
			
		}
		else if(code == 1110)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==11 && itr.getSubject_name()=="Computer_Application")
				{
					selectedTest.add(itr);
				}
			}
		}
		
		
		//=======================================================
		//=======================================================
		
		else if(code == 1201)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==12)
				{
					selectedTest.add(itr);
				}
			}
			
		}
		else if(code == 1202)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==12 && itr.getSubject_name()=="Physics")
				{
					selectedTest.add(itr);
				}
			}
		}
		else if(code == 1203)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==12 && itr.getSubject_name()=="Chemistry")
				{
					selectedTest.add(itr);
				}
			}
		}
		else if(code == 1204)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==12 && itr.getSubject_name()=="Biology")
				{
					selectedTest.add(itr);
				}
			}
			
		}
		else if(code == 1205)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==12 && itr.getSubject_name()=="Botany")
				{
					selectedTest.add(itr);
				}
			}
		}
		else if(code == 1206)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==12 && itr.getSubject_name()=="Zoology" )
				{
					selectedTest.add(itr);
				}
			}
			
		}
		else if(code == 1207)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==12 && itr.getSubject_name()=="Commerce")
				{
					selectedTest.add(itr);
				}
			}
		}
		else if(code == 1208)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==12 && itr.getSubject_name()=="Accounts")
				{
					selectedTest.add(itr);
				}
			}
		}
		else if(code == 1209)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==12 && itr.getSubject_name()=="Buisness_Maths")
				{
					selectedTest.add(itr);
				}
			}
			
		}
		else if(code == 1210)
		{
			for(Test itr : fullList)
			{
				if(itr.getGrade()==12 && itr.getSubject_name()=="Computer_Application")
				{
					selectedTest.add(itr);
				}
			}
		}
		
		
		
		
		
		return selectedTest;
	}
	
	
	

}
