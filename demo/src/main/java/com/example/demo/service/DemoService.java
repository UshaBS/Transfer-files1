package com.example.demo.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Set;

import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Inputs;

@Service
public class DemoService {
	
	final static String T = "\t";
	final static String $2T = "\t\t";
	final static String $3T = "\t\t\t";
	final static String $4T = "\t\t\t\t";
	final static String $5T = "\t\t\t\t\t";
	final static String $6T = "\t\t\t\t\t\t";
	final static String $7T = "\t\t\t\t\t\t\t"; 
	

	public String getDetails(Inputs input) throws IOException {

		FileWriter filewriter=new FileWriter("example.yml");
		BufferedWriter bufferwriter= new BufferedWriter(filewriter);
		bufferwriter.write("swagger: "+"\""+input.getSwagger()+"\"\n");
		bufferwriter.write("info: \n");	
		bufferwriter.write(T+"description: "+"\""+input.getDescription()+"\"\n");
		bufferwriter.write(T+"version: "+"\""+input.getVersion()+"\"\n");
		bufferwriter.write(T+"title: "+ "\""+input.getTitle()+"\"\n");
		bufferwriter.write("host: "+"\""+ input.getHost()+"\"\n");
		bufferwriter.write("basePath: "+ "\""+input.getBasePath()+"\"\n");
		bufferwriter.write("tags: \n");
		bufferwriter.write("- name: "+ "\"University\"\n");	
		bufferwriter.write(T+"description: "+"\""+"everything about your University\"\n");
		bufferwriter.write(T+"externalDocs: \n");
		bufferwriter.write($2T+"description: \"Find out more\"\n");
		bufferwriter.write($2T+"url: \"http://swagger.io\"\n");
		bufferwriter.write("- name: "+ "\"Student\"\n");
		bufferwriter.write(T+"description: "+"\""+"operations about users\"\n");
		bufferwriter.write(T+"externalDocs: \n");
		bufferwriter.write($2T+"description: \"Find out more\"\n");
		bufferwriter.write($2T+"url: \"http://swagger.io\"\n");
		bufferwriter.write("schemes:\r\n" + "- \"https\"\r\n" + "- \"http\"\n");
		bufferwriter.write("paths:\n");
		

		/****************************************************************post call*****************************************************************************/
		Set<Class<? extends Object>> object = getPojo();
		
			

		for(Class<? extends Object> cls : object) {

			bufferwriter.write(T+"/"+cls.getSimpleName()+":\n");
			bufferwriter.write(T+"\tpost:\n");
			bufferwriter.write($3T+"tags: \n");
			bufferwriter.write($3T+"- \""+cls.getSimpleName()+"\"\n");
			bufferwriter.write($3T+ "summary: "+"\""+"Add a new "+ cls.getSimpleName()+"\"\n");
			bufferwriter.write($3T+"description: "+"\""+cls.getSimpleName()+" object that needs to be added to the store"+"\"\n");
			bufferwriter.write($3T+"operationId: "+"\""+"add"+cls.getSimpleName()+"\"\n");
			bufferwriter.write($3T+"consumes:\r\n" +$3T+"- \"application/json\"\n");
			bufferwriter.write($3T+"- \"application/xml\"\n");
			bufferwriter.write($3T+"produces:\r\n" +$3T+"- \"application/json\"\n");
			bufferwriter.write($3T+"- \"application/xml\"\n");
			bufferwriter.write($3T+"parameters: \n");
			bufferwriter.write($3T+"- in: "+"\"body\"\n");
			bufferwriter.write($4T+"name: "+"\"body\"\n");
			bufferwriter.write($4T+"description: "+"\""+cls.getSimpleName()+"object that needs to be added to the store\"\n");
			bufferwriter.write($4T+"required: "+"true\n");
			bufferwriter.write($4T+"schema: \n");
			bufferwriter.write($5T+"$"+"ref: ");
			bufferwriter.write($6T+"\"#/definitions/"+cls.getSimpleName()+"\"\n");
			bufferwriter.write($3T+"responses: \n");
			bufferwriter.write($4T+"400: ");
			bufferwriter.newLine();
			bufferwriter.write($5T+"description: "+"\"Invalid input\"\n");
			bufferwriter.write($4T+"404: \n");
			bufferwriter.write($5T+"description: "+"\"object not found\"\n");
			bufferwriter.write($4T+"405: \n");
			bufferwriter.write($5T+"description: "+"\"Exception\"\n");

			/******************************************************put call*********************************************************************************/


			bufferwriter.write($2T+"put: \n");
			bufferwriter.write($3T+"tags: \n");
			bufferwriter.write($3T+"- \""+cls.getSimpleName()+"\"\n");
			bufferwriter.write($3T+"summary: "+"\""+"update "+cls.getSimpleName()+"\"\n");
			bufferwriter.write($3T+"description: "+"\""+cls.getSimpleName()+" object that needs to be updated to the store"+"\"\n");
			bufferwriter.write($3T+"operationId: "+"\""+"update"+cls.getSimpleName()+"\"\n");
			bufferwriter.write($3T+"consumes:\r\n" +$3T+"- \"application/json\"\n");
			bufferwriter.write($3T+"- \"application/xml\"\n");
			bufferwriter.write($3T+"produces:\r\n" +$3T+"- \"application/json\"\n");
			bufferwriter.write($3T+"- \"application/xml\"\n");
			bufferwriter.write($3T+"parameters: \n");
			bufferwriter.write($3T+"- in: "+"\"body\"\n");
			bufferwriter.write($4T+"name: "+"\"body\"\n");
			bufferwriter.write($4T+"description: "+"\""+cls.getSimpleName()+"object that needs to be added to the store\"\n");
			bufferwriter.write($4T+"required: "+"true\n");
			bufferwriter.write($4T+"schema: \n");
			bufferwriter.write($5T+"$"+"ref: ");
			bufferwriter.write($6T+"\"#/definitions/"+cls.getSimpleName()+"\"\n");
			bufferwriter.write($3T+"responses: \n");
			bufferwriter.write($4T+"400: ");
			bufferwriter.newLine();
			bufferwriter.write($5T+"description: "+"\"Invalid input\"\n");
			bufferwriter.write($4T+"404: \n");
			bufferwriter.write($5T+"description: "+"\"object not found\"\n");
			bufferwriter.write($4T+"405: \n");
			bufferwriter.write($5T+"description: "+"\"Exception\"\n");


			/***********************************************************************delete call*********************************************************************************************/

			bufferwriter.write($2T+"delete: \n");
			bufferwriter.write($3T+"tags: \n");
			bufferwriter.write($3T+"- \""+cls.getSimpleName()+"\"\n");
			bufferwriter.write($3T+"summary: "+"\""+"delete "+cls.getSimpleName()+"\"\n");
			bufferwriter.write($3T+"description: "+"\""+cls.getSimpleName()+" object that needs to be deleted from the store"+"\"\n");
			bufferwriter.write($3T+"operationId: "+"\""+"delete"+cls.getSimpleName()+"\"\n");
			bufferwriter.write($3T+"consumes:\r\n" +$3T+"- \"application/json\"\n");
			bufferwriter.write($3T+"- \"application/xml\"\n");
			bufferwriter.write($3T+"produces:\r\n" +$3T+"- \"application/json\"\n");
			bufferwriter.write($3T+"- \"application/xml\"\n");
			bufferwriter.write($3T+"parameters: \n");
			bufferwriter.write($3T+"- "+ "in: "+"\"body\"\n");
			bufferwriter.write($4T+"name: "+"\"body\"\n");
			bufferwriter.write($4T+"description: "+"\""+cls.getSimpleName()+"object that needs to be deleted from the store\"\n");
			bufferwriter.write($4T+"required: "+"true\n");
			bufferwriter.write($4T+"schema: \n");
			bufferwriter.write($5T+"$"+"ref: ");
			bufferwriter.write($6T+"\"#/definitions/"+cls.getSimpleName()+"\"\n");
			bufferwriter.write($3T+"responses: \n");
			bufferwriter.write($4T+"400: \n");
			bufferwriter.write($5T+"description: "+"\"Invalid input\"\n");
			bufferwriter.write($4T+"404: \n");
			bufferwriter.write($5T+"description: "+"\"object not found\"\n");
			bufferwriter.write($4T+"405: \n");
			bufferwriter.write($5T+"description: "+"\"Exception\"\n");


			/*****************************************************************************get call****************************************************************************/

			
			
			
			 bufferwriter.write(T+"/"+cls.getSimpleName()+"/{"+"regno"+"}:\n"); 
			bufferwriter.write($2T+"get: \n");
			bufferwriter.write($3T+"tags: \n");
			bufferwriter.write($3T+"- \""+cls.getSimpleName()+"\"\n");
			bufferwriter.write($3T+"summary: "+"\""+"get a "+cls.getSimpleName()+"\"\n");
			bufferwriter.write($3T+"description: "+"\""+cls.getSimpleName()+" object that should be get"+"\"\n");
			bufferwriter.write($3T+"operationId: "+"\""+"get"+cls.getSimpleName()+"\"\n");
			bufferwriter.write($3T+"produces:\r\n" +$3T+"- \"application/json\"\n");
			bufferwriter.write($3T+"- \"application/xml\"\n");
			bufferwriter.write($3T+"parameters: \n");
			bufferwriter.write($3T+"- name: "+"\"regno\"\n");
			bufferwriter.write($4T+"in: "+"\"path\"\n");
			bufferwriter.write($4T+"description: "+"\""+cls.getSimpleName()+" object that should be get from the store\"\n");
			bufferwriter.write($4T+"required: "+"true\n");
			bufferwriter.write($4T+"type: "+"\"integer\"\n");
			bufferwriter.write($4T+"format: "+"\"int64\"\n");
            bufferwriter.write($3T+"responses: \n");
			bufferwriter.write($4T+"400: \n");
			bufferwriter.write($5T+"description: "+"\"Invalid input\"\n");
			bufferwriter.write($5T+"schema: \n");
			bufferwriter.write($6T+"$"+"ref: ");
			bufferwriter.write($6T+"\"#/definitions/"+cls.getSimpleName()+"\"\n");
			bufferwriter.write($4T+"404: \n");
			bufferwriter.write($5T+"description: "+"\"object not found\"\n");
			bufferwriter.write($4T+"405: \n");
			bufferwriter.write($5T+"description: "+"\"Exception\"\n");
		}
		bufferwriter.write("definitions: \n");

		for(Class<? extends Object> cls : object) {

			bufferwriter.write(T+cls.getSimpleName()+": \n");
			bufferwriter.write($2T+"type: "+"\"object\"\n");
			bufferwriter.write($2T+"properties: \n");

			for(Field field:cls.getDeclaredFields()) {
				bufferwriter.write($3T+ field.getName()+": \n");
				bufferwriter.write($4T+"type: ");


				if((field.getType().getSimpleName()).equals("List")) 
				{
					
					bufferwriter.write("\"array\"\n");
					bufferwriter.write($4T+"items: \n");
					bufferwriter.write($5T+"type: "+"\"string\"\n");
					
				}
				else if((field.getType().getSimpleName()).equals("BigInteger"))
				{
					bufferwriter.write("\"integer\"\n");
				}
				
				else {
					System.out.println(field.getType().getSimpleName());
					/*
					 * bufferwriter.write(
					 * "\""+field.getType().getSimpleName().toLowerCase()+"\"\n");
					 */
					bufferwriter.write("\"string\"\n");
					bufferwriter.write($4T+"format: "+"\"date-time\"\n");
				}

				/*
				 * if(field.getType().getSimpleName().toLowerCase().matches("biginteger")) {
				 * bufferwriter.write("\t\t\t\tformat: "); bufferwriter.write(
				 * "\""+"int64"+"\""); bufferwriter.newLine(); }
				 */
			}
			bufferwriter.write($2T+"xml:\n");
			bufferwriter.write($3T+"name: "+"\""+cls.getSimpleName()+"\"\n");
		}
		bufferwriter.write("externalDocs: \n");
		bufferwriter.write(T+"description: "+"\"Find out more about Swagger\"\n");
		bufferwriter.write(T+"url: \"http://swagger.io\"\n");
		bufferwriter.close();
		return "Details added Successfully";
	
	
	}
	public Set<Class<? extends Object>> getPojo() {
		Reflections reflections = new Reflections("com.example.xml",new SubTypesScanner(false));
		return reflections.getSubTypesOf(Object.class);
	}
	
}
