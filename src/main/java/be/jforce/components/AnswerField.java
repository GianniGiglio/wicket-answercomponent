package be.jforce.components;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.FormComponent;
import org.apache.wicket.model.Model;
import org.apache.wicket.validation.IValidator;

import be.jforce.components.model.Answer;
import be.jforce.components.model.ValidationType;

public abstract class AnswerField extends FormComponent<Answer> {
	
	private Label indicator;
	
	public AnswerField(String id) {
		super(id);
		this.indicator =new Label("indicator");
		indicator.add(new AttributeModifier("class", new Model<String>("tooltips pending tooltips")));
		add(indicator);
	   	try {
			add((IValidator<Answer>) getValidationType().getValidatorClass().newInstance());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	}

	public abstract ValidationType getValidationType();

  
  
}
