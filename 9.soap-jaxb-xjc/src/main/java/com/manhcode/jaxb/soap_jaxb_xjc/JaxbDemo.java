package com.manhcode.jaxb.soap_jaxb_xjc;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.bharatthippireddy.patient.Patient;

public class JaxbDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start Main");
		StringWriter writer = testMarshaller();
		testUnMarshaller(writer);
	}

	public static StringWriter testMarshaller() {
		try {
			JAXBContext context = JAXBContext.newInstance(Patient.class);
			Marshaller marshaller = context.createMarshaller();
			Patient patient = new Patient();
			patient.setId(1);
			patient.setName("Manh");

			StringWriter stringWriter = new StringWriter();
			marshaller.marshal(patient, stringWriter);
			System.out.println(stringWriter.toString());
			return stringWriter;
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void testUnMarshaller(StringWriter writer) {
		try {
			JAXBContext context = JAXBContext.newInstance(Patient.class);
			Unmarshaller un = context.createUnmarshaller();
			Patient patient = (Patient) un.unmarshal(new StringReader(writer.toString()));
			System.out.println("Patient:" + patient.getId() + " " + patient.getName());

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
