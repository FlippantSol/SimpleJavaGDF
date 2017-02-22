package com.jamescho.game.main.framework.util;

/**
 * Created by k0765197 on 2/22/2017.
 */
    public class InputHandler implements
        KeyListener, MouseListener {
        private State currentState;

        @Override
        public void keyTyped(KeyEvent e) { }

        @Override
        public void keyPressed(KeyEvent e) { currentState.onKeyPress(e); }

        @Override
        public void keyReleased(KeyEvent e) {currentState.onKeyRelease(e); }
    }
