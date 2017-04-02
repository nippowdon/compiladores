package br.ufmg.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.runtime.RecognitionException;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import br.ufmg.compiler.L2017_1Lexer;
import br.ufmg.compiler.L2017_1Parser;
import br.ufmg.error.CompilerErrorListener;
import br.ufmg.error.ErrorMessages;

public class L2017_1Compiler {

	/**
	 * Does the lexical and the syntactical parsing of the input
	 * @param filePath
	 * @throws IOException
	 */
	private boolean parse(String filePath) throws IOException,RecognitionException {

		InputStream input = new FileInputStream(new File(filePath));
		L2017_1Lexer lexer = new L2017_1Lexer(new ANTLRInputStream(input));
		L2017_1Parser parser = new L2017_1Parser(new CommonTokenStream(lexer));
		parser.addErrorListener(new CompilerErrorListener());
		parser.goal();
		for(ANTLRErrorListener el : parser.getErrorListeners()){
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
		
		L2017_1Compiler compiler = new L2017_1Compiler();
		String inputFilePath = null;
		
		if(args.length > 0){
			inputFilePath = "." + File.separator + args[0];
		}
		else{
			System.out.println("No parameter called detected on compiler call. The parameter must be the name of the input file.");
			return;
		}
		
		boolean successfullyParsedFile = false;
		
		try{
			successfullyParsedFile = compiler.parse(inputFilePath);
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
