/**
 * 
 */
package com.infy.jlf.objects;

import com.infy.jlf.annotation.ChangeDetail;

/**
 * @author ezekiel.inalegwu
 *
 */
@ChangeDetail(authorName = "Ezekiel", methodName = "calculateFee")
public class DayScholar extends Student{

    float stipend;
    
    public DayScholar(int id,String name,float stipend)
    {
        super(id,name);
        this.stipend=stipend;
    }
    public String toString()
    {
        return "Id = "+super.getStudentId()+" Name = "+super.getStudentName()+" Stipend = "+stipend;
    }
    
	@Override
	void calculateFee() {
		// TODO Auto-generated method stub
	}

}
