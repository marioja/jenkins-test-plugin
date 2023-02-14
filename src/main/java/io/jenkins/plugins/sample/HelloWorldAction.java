package io.jenkins.plugins.sample;

import hudson.model.Run;
import jenkins.model.RunAction2;

public class HelloWorldAction implements RunAction2 {
	
	private String name;
	
	private transient Run run;
	
	public HelloWorldAction(String aName) {
		this.name = aName;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String getIconFileName() {
		// TODO Auto-generated method stub
		return "document.png";
	}

	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return "Greetings displayName";
	}

	@Override
	public String getUrlName() {
		// TODO Auto-generated method stub
		return "greeting";
	}

	@Override
	public void onAttached(Run<?, ?> r) {
		this.run = r;
		
	}

	@Override
	public void onLoad(Run<?, ?> r) {
		this.run = r;
		
	}
	
	public Run getRun() {
		return this.run;
	}

}
