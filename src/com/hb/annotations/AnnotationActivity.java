package com.hb.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class AnnotationActivity extends Activity {

	// Comment
	
	@MyAnnotation(id = R.id.edtText, tag = "KKRemoteEditTextTag")
	public EditText editText;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_annotation);
	
		String tag = getTagOfEditText();
		
	}

	private String getTagOfEditText() 
	{
		try 
		{
			
			Field field = this.getClass().getField("editText");
			
			Annotation annotations[] = field.getAnnotations();
            if(annotations != null && annotations.length>0)
            {
            	
            }
            
			MyAnnotation myAnno = field.getAnnotation(MyAnnotation.class);
            Log.e("key: ",""+myAnno.id());
            Log.e("value: ",myAnno.tag());
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		return null;
	}
	
	
}
