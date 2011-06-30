package oqueacho

import net.htmlparser.jericho.*

class HtmlService {

    static transactional = false

	def getMetaValue(String url, String key) {
		Source source = new Source(new URL(url));
		
		for (int pos=0; pos<source.length();) {
			StartTag startTag=source.getNextStartTag(pos,"name",key,false);
			if (startTag==null) return null;
			if (startTag.getName()==HTMLElementName.META)
				return startTag.getAttributeValue("content"); // Attribute values are automatically decoded
			pos=startTag.getEnd();
		}
		return '';
	}
}
