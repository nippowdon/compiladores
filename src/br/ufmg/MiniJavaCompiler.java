package br.ufmg;

import java.io.IOException;

import org.antlr.runtime.RecognitionException;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import br.ufmg.compiler.MiniJavaLexer;
import br.ufmg.compiler.MiniJavaParser;
import br.ufmg.error.CompilerErrorListener;
import br.ufmg.error.ErrorMessages;

public class MiniJavaCompiler {

	/**
	 * Does the lexical and the syntactical parsing of the input
	 * @param filePath
	 * @throws IOException
	 */
	private boolean parse(String filePath) throws IOException,RecognitionException{

		MiniJavaLexer miniJavaLexer = new MiniJavaLexer(new ANTLRInputStream(getClass().getResourceAsStream(filePath)));
		MiniJavaParser miniJavaParser = new MiniJavaParser(new CommonTokenStream(miniJavaLexer));
		miniJavaParser.addErrorListener(new CompilerErrorListener());
		miniJavaParser.goal();
		for(ANTLRErrorListener el : miniJavaParser.getErrorListeners()){
			if(el instanceof CompilerErrorListener){
				if(((CompilerErrorListener) el).getErrorList().size() == 0){
					return true;
				}
				else{
					return false;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args){
		
		MiniJavaCompiler miniJavaCompiler = new MiniJavaCompiler();
		String inputFilePath = null;
		
		if(args.length > 0){
			inputFilePath = "/" + args[0];
		}
		else{
			System.out.println("No parameter called detected on compiler call. The parameter must be the name of the input file.");
			return;
		}
		
		boolean successfullyParsedFile = false;
		
		try{
			successfullyParsedFile = miniJavaCompiler.parse(inputFilePath);
		} catch(IOException e){
			System.out.println(ErrorMessages.INPUT_FILE_NOT_FOUND);
		} catch (RecognitionException e) {
			System.out.println(ErrorMessages.FAILED_TO_PARSE_FILE);
		} 
		
		if(successfullyParsedFile){
			System.out.println("File successfully parsed");
		}
	}
}
