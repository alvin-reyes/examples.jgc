package com.areyes1.junitreport.service;


public class JUnitReportServiceExample {
	
	public void initiateMetaData(ServiceObject serviceObject) {
		serviceObject.setControlNo(1);
		serviceObject.setDescription("This is a sample service object");
		serviceObject.setMetaData("{{data1:data2},{data3:data4}}");
		serviceObject.setName("Service Object Name");
		serviceObject.setStatus("New");
	}
	
	public ServiceObject processObject(ServiceObject serviceObject) {
		System.out.println(">>> processing - started");
		serviceObject.setStatus("Processed");
		System.out.println(">>> processing - done");
		return serviceObject;
	}
	
	public ServiceObject postProcessing(ServiceObject serviceObject) {
		System.out.println(">>> processing - started");
		serviceObject.setMetaData("{{{data1:data2},{data3:data4}},{status:complete}}");
		serviceObject.setStatus("Complete");
		System.out.println(">>> processing - done");
		return serviceObject;
	}
	
}
