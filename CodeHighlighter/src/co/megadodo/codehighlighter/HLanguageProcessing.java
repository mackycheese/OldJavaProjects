package co.megadodo.codehighlighter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HLanguageProcessing extends HLanguageJava {
	public HLanguageProcessing() {
		init(Arrays.<String>asList("catch",
"class",
"delay",
"draw",
"exit",
"extends",
"false",
"final",
"implements",
"import",
"loop",
"new",
"noLoop",
"null",
"popStyle",
"private",
"public",
"pushStyle",
"redraw",
"return",
"setup",
"static",
"super",
"this",
"true",
"try",
"void",
"cursor",
"focused",
"frameCount",
"frameRate",
"frameRate",
"height",
"noCursor",
"online",
"screen",
"width",
"boolean",
"byte",
"char",
"color",
"double",
"float",
"int",
"long",
"Array",
"ArrayList",
"HashMap",
"Object",
"String",
"XMLElement",
"binary",
"boolean",
"byte",
"char",
"float",
"hex",
"int",
"str",
"unbinary",
"unhex",
"join",
"match",
"matchAll",
"nf",
"nfc",
"nfp",
"nfs",
"split",
"splitTokens",
"trim",
"Array Functions",
"append",
"arrayCopy",
"concat",
"expand",
"reverse",
"shorten",
"sort",
"splice",
"subset",
"for",
"while",
"break",
"case",
"continue",
"default",
"else",
"if",
"switch",
"PShape",
"arc",
"ellipse",
"line",
"point",
"quad",
"rect",
"triangle",
"bezier",
"bezierDetail",
"bezierPoint",
"bezierTangent",
"curve",
"curveDetail",
"curvePoint",
"curveTangent",
"curveTightness",
"box",
"sphere",
"sphereDetail",
"ellipseMode",
"noSmooth",
"rectMode",
"smooth",
"strokeCap",
"strokeJoin",
"strokeWeight",
"beginShape",
"bezierVertex",
"curveVertex",
"endShape",
"texture",
"textureMode",
"vertex",
"loadShape",
"shape",
"shapeMode",
"mouseButton",
"mouseClicked",
"mouseDragged",
"mouseMoved",
"mousePressed",
"mousePressed",
"mouseReleased",
"mouseX",
"mouseY",
"pmouseX",
"pmouseY",
"key",
"keyCode",
"keyPressed",
"keyPressed",
"keyReleased",
"keyTyped",
"BufferedReader",
"createInput",
"createReader",
"loadBytes",
"loadStrings",
"open",
"selectFolder",
"selectInput",
"link",
"param",
"status",
"day",
"hour",
"millis",
"minute",
"month",
"second",
"year",
"print",
"println",
"save",
"saveFrame",
"PrintWriter",
"beginRaw",
"beginRecord",
"createOutput",
"createWriter",
"endRaw",
"endRecord",
"saveBytes",
"saveStream",
"saveStrings",
"selectOutput",
"applyMatrix",
"popMatrix",
"printMatrix",
"pushMatrix",
"resetMatrix",
"rotate",
"rotateX",
"rotateY",
"rotateZ",
"scale",
"shearX",
"shearY",
"translate",
"ambientLight",
"directionalLight",
"lightFalloff",
"lightSpecular",
"lights",
"noLights",
"normal",
"pointLight",
"spotLight",
"beginCamera",
"camera",
"endCamera",
"frustum",
"ortho",
"perspective",
"printCamera",
"printProjection",
"modelX",
"modelY",
"modelZ",
"screenX",
"screenY",
"screenZ",
"ambient",
"emissive",
"shininess",
"specular",
"background",
"colorMode",
"fill",
"noFill",
"noStroke",
"stroke",
"alpha",
"blendColor",
"blue",
"brightness",
"color",
"green",
"hue",
"lerpColor",
"red",
"saturation",
"PImage",
"createImage",
"image",
"imageMode",
"loadImage",
"noTint",
"requestImage",
"tint",
"blend",
"copy",
"filter",
"get",
"loadPixels",
"pixels[]",
"set",
"updatePixels",
"PGraphics",
"createGraphics",
"hint",
"PFont",
"Loading & Displaying",
"createFont",
"loadFont",
"textFont",
"textAlign",
"textLeading",
"textMode",
"textSize",
"textWidth",
"textAscent",
"textDescent",
"PVector",
"abs",
"ceil",
"constrain",
"dist",
"exp",
"floor",
"lerp",
"log",
"mag",
"map",
"max",
"min",
"norm",
"pow",
"round",
"sq",
"sqrt",
"acos",
"asin",
"atan",
"atan2",
"cos",
"degrees",
"radians",
"sin",
"tan",
"noise",
"noiseDetail",
"noiseSeed",
"random",
"randomSeed",
"HALF_PI",
"PI",
"QUARTER_PI",
"TWO_PI",
"PApplet"
));
	}

	void init(List<String> list) {
		ArrayList<String> _list = new ArrayList<String>();
		for(String s : list) _list.add(s);
		_list.removeAll(keywords);
		codewords.addAll(_list);
	}
//	
}
