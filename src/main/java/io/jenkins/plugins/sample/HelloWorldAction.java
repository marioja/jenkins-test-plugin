package io.jenkins.plugins.sample;

import hudson.model.Action;

public class HelloWorldAction implements Action {
	
	private String name;
	
	public HelloWorldAction(String aName) {
		this.name = aName;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String getIconFileName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUrlName() {
		// TODO Auto-generated method stub
		return null;
	}

}
