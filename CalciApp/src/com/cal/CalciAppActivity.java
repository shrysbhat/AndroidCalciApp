package com.cal;

//import android.R.string;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalciAppActivity extends Activity implements OnClickListener 
{
    /** Called when the activity is first created. */

	EditText  eNo1,eNo2,eR;
	Button bAdd,bSub,bMul,bDiv;
	
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
	   eNo1= (EditText) findViewById(R.id.txtno1);
	   eNo2=(EditText)findViewById(R.id.txtno2);
   	   eR=(EditText) findViewById(R.id.res);
	   
   	   bAdd=(Button)findViewById(R.id.add1);
	   bSub=(Button)findViewById(R.id.sub1);
	   bMul=(Button)findViewById(R.id.mul1);
	   bDiv=(Button)findViewById(R.id.div1);
	   
	   bAdd.setOnClickListener(this);
	   bSub.setOnClickListener(this);
	   bMul.setOnClickListener(this);
	   bDiv.setOnClickListener(this);
	
	}

	public void onClick(View v) 
	{
		double n1=0,n=0,result=0;
		String s1;
	    
		n1=Integer.parseInt(eNo1.getText().toString().trim());
	    n=Integer.parseInt(eNo2.getText().toString().trim());
	    Log.d(n+"","number2");
	    Log.d(n1+"","number1");
        
	    if(v.getId()==bAdd.getId())
	    {
           
	       	result=n1+n;
	    	 Log.d(result+"","sum");
	    	 Toast.makeText(this,result+" is the Addition",Toast.LENGTH_LONG).show();
	    	 s1=String.valueOf(result);
	    	 eR.setText(s1);
	    }
	    if(v.getId()==bSub.getId())
	    {
           
	       	result=n1-n;
	    	 Log.d(result+"","sub");
	    	 Toast.makeText(this,result+" is the Difference",Toast.LENGTH_LONG).show();
	    	 s1=String.valueOf(result);
	    	 eR.setText(s1);
	    }
	    if(v.getId()==bMul.getId())
	    {
           
	       	result=n1*n;
	    	 Log.d(result+"","mul");
	    	 Toast.makeText(this,result+" is the Multiplication",Toast.LENGTH_LONG).show();
	    	 s1=String.valueOf(result);
	    	 eR.setText(s1);
	    }
	    if(v.getId()==bDiv.getId())
	    {
           
	       	result=n1/n;
	    	 Log.d(result+"","div");
	    	 Toast.makeText(this,result+" is the Division",Toast.LENGTH_LONG).show();
	    	 s1=String.valueOf(result);
	    	 eR.setText(s1);
	    }
	}
}