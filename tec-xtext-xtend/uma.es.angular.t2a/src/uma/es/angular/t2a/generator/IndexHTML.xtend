package uma.es.angular.t2a.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import uma.es.angular.t2a.t2A.Root

class IndexHTML {
	static def toIndexHTMLFile(Root root, IFileSystemAccess2 fsa){
		var relativePath = ''; // in directory src
		fsa.generateFile(relativePath + 'index.html', toContent(root));	
	}
	
	private static def toContent(Root root){
		'''
		<!doctype html>
		<html lang="en">
		<head>
		  <meta charset="utf-8">
		  <title>«root.appName»</title>
		  <base href="/">
		  <meta name="viewport" content="width=device-width, initial-scale=1">
  		  «IF root.styleOnline !== null »
		  «FOR fulltag: root.styleOnline.fullTags»
		  «fulltag»
		  «ENDFOR»
		  «ENDIF»

		  <link rel="icon" type="image/x-icon" href="favicon.ico">
		</head>
		<body>
		  <app-root></app-root>
		  «IF root.jsOnline !== null»
  		  «FOR jsFulltag: root.jsOnline.fullTags»
  		  «jsFulltag»
  		  «ENDFOR»
  		  «ENDIF»
		</body>
		</html>
		
		'''
	}
}