package br.ufmg.error;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class CompilerErrorListener extends ConsoleErrorListener{

	private List<RecognitionException> errorList = new ArrayList<RecognitionException>();
	
	/**
	 * Saves the error in the list of errors
	 */
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer,
			Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
		errorList.add(e);
	}
	
	public List<RecognitionException>  getErrorList(){
		return errorList;
	}
	
}
