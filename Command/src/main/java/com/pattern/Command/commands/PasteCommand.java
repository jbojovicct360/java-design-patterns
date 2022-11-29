package com.pattern.Command.commands;

import com.pattern.Command.editor.Editor;

public class PasteCommand extends Command{

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return false;
    }
}
