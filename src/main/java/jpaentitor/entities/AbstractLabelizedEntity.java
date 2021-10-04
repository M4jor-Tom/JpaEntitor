package jpaentitor.entities;

public class AbstractLabelizedEntity extends AbstractEntity implements Labelizable {

	private String label;
	
	public AbstractLabelizedEntity(String label)
	{
		super();
		
		setLabel(label);
	}
	
	@Override
	public String getLabel() {
		return label;
	}

	@Override
	public void setLabel(String label) {
		this.label = label;
	}

}