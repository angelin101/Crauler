package craulerPrj;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sourceit on 17.09.15.
 *
 */
public class HTMLLinkExtractor {
    //"<a href='http://www.google.com'>google</a>"

    private Pattern patternTag, patternLink;
    private Matcher matcherTag, matcherLink;

    private static final String HTML_A_TAG_PATTERN = "(?i)<a([^>]+)>(.+?)</a>";
    private static final String HTML_A_HREF_TAG_PATTERN =
            "\\s*(?i)href\\s*=\\s*(\"([^\"]*\")|'[^']*'|([^'\">\\s]+))";


    public HTMLLinkExtractor(){
        patternTag = Pattern.compile(HTML_A_TAG_PATTERN); //
        patternLink = Pattern.compile(HTML_A_HREF_TAG_PATTERN); //
    }

    /*public Set<String> grabHTMLLinks(final String html){
        Set<String> result = new LinkedHashSet<String>();
            matcherTag = patternTag.matcher(html);
            matcherLink = patternLink.matcher(html);

    }*/
}
