package com.thetdgroup;

import java.io.File;
import java.net.URI;
import java.util.HashMap;

import org.apache.xmlbeans.XmlOptions;

import comThetdgroupSchemaRosettaRev10.EntryDocument;
import comThetdgroupSchemaRosettaRev10.EntryDocument.Entry;

public final class RosettaLexiconBuilder
{
	private XmlOptions xmlOptions = null;
 private Entry entryDocument = null;
	
	//
	public RosettaLexiconBuilder()
	{
		HashMap<String, String> suggestedPrefixes = new HashMap<String, String>();
		suggestedPrefixes.put("urn:com:thetdgroup:schema:rosetta:rev1", "tdg");
		suggestedPrefixes.put("http://www.w3.org/2001/XMLSchema-instance", "xsi");
		suggestedPrefixes.put("urn:com:thetdgroup:schema:rosetta:rev1 rosetta.dictionary.xsd", "SchemaLocation");

		xmlOptions = new XmlOptions();
		xmlOptions.setSaveSuggestedPrefixes(suggestedPrefixes);
		xmlOptions.setCharacterEncoding("UTF-8");
		xmlOptions.setSavePrettyPrint();
		xmlOptions.setSaveNamespacesFirst();
		xmlOptions.setLoadStripWhitespace();
		xmlOptions.setBaseURI(URI.create("www.thetdgroup.com"));
		xmlOptions.setDocumentSourceName("www.thetdgroup.com");
		xmlOptions.setSaveAggressiveNamespaces();
		xmlOptions.setSaveOuter();	
	}

	//
	public void loadDocument(File inputXMLFile) throws Exception
	{
		EntryDocument doc = EntryDocument.Factory.parse(inputXMLFile, xmlOptions);
		entryDocument = doc.getEntry();
	 
		entryDocument.toString();
	}
	
	public void loadDocument(String inputXMLFile) throws Exception
	{
		EntryDocument doc = EntryDocument.Factory.parse(inputXMLFile, xmlOptions);
		entryDocument = doc.getEntry();
	 
		entryDocument.toString();
	}
	
	//
	public void saveDocument(File outputXMLFile) throws Exception
	{
		entryDocument.save(outputXMLFile, xmlOptions);
	}
	
	public String saveDocument() throws Exception
	{
		return entryDocument.xmlText(xmlOptions);
	}
	
	public void printDocument()
	{
		System.out.println(entryDocument.toString());
	}
	
	public Entry getEntry()
	{
		return entryDocument;
	}
}
