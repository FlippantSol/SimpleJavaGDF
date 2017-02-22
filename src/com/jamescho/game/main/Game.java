package com.jamescho.game.main;

import com.jamescho.game.main.framework.util.InputHandler;

/**
 * Created by cortman on 2/14/17.
 */
public class Game {

    private void initInput() {
        inputHandler = new InputHandle();
        addKeyListener();
        addKeyListener(InputHandler);
        addMouseListener(InputHandler);
    }
}
