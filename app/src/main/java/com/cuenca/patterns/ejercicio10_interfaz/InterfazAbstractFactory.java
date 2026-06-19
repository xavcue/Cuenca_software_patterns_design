package com.cuenca.patterns.ejercicio10_interfaz;

interface Boton {
    void pintar();
}

interface Checkbox {
    void pintar();
}

interface Menu {
    void pintar();
}

class BotonWindows implements Boton {
    @Override
    public void pintar() {
        System.out.println("Boton estilo Windows");
    }
}

class CheckboxWindows implements Checkbox {
    @Override
    public void pintar() {
        System.out.println("Checkbox estilo Windows");
    }
}

class MenuWindows implements Menu {
    @Override
    public void pintar() {
        System.out.println("Menu estilo Windows");
    }
}

class BotonMac implements Boton {
    @Override
    public void pintar() {
        System.out.println("Boton estilo macOS");
    }
}

class CheckboxMac implements Checkbox {
    @Override
    public void pintar() {
        System.out.println("Checkbox estilo macOS");
    }
}

class MenuMac implements Menu {
    @Override
    public void pintar() {
        System.out.println("Menu estilo macOS");
    }
}

class BotonLinux implements Boton {
    @Override
    public void pintar() {
        System.out.println("Boton estilo Linux");
    }
}

class CheckboxLinux implements Checkbox {
    @Override
    public void pintar() {
        System.out.println("Checkbox estilo Linux");
    }
}

class MenuLinux implements Menu {
    @Override
    public void pintar() {
        System.out.println("Menu estilo Linux");
    }
}

interface InterfazFactory {
    Boton crearBoton();
    Checkbox crearCheckbox();
    Menu crearMenu();
}

class WindowsFactory implements InterfazFactory {
    @Override
    public Boton crearBoton() {
        return new BotonWindows();
    }

    @Override
    public Checkbox crearCheckbox() {
        return new CheckboxWindows();
    }

    @Override
    public Menu crearMenu() {
        return new MenuWindows();
    }
}

class MacFactory implements InterfazFactory {
    @Override
    public Boton crearBoton() {
        return new BotonMac();
    }

    @Override
    public Checkbox crearCheckbox() {
        return new CheckboxMac();
    }

    @Override
    public Menu crearMenu() {
        return new MenuMac();
    }
}

class LinuxFactory implements InterfazFactory {
    @Override
    public Boton crearBoton() {
        return new BotonLinux();
    }

    @Override
    public Checkbox crearCheckbox() {
        return new CheckboxLinux();
    }

    @Override
    public Menu crearMenu() {
        return new MenuLinux();
    }
}

public class InterfazAbstractFactory {
    public static void main(String[] args) {

        InterfazFactory windows = new WindowsFactory();
        windows.crearBoton().pintar();
        windows.crearCheckbox().pintar();
        windows.crearMenu().pintar();

        InterfazFactory mac = new MacFactory();
        mac.crearBoton().pintar();
        mac.crearCheckbox().pintar();
        mac.crearMenu().pintar();

        InterfazFactory linux = new LinuxFactory();
        linux.crearBoton().pintar();
        linux.crearCheckbox().pintar();
        linux.crearMenu().pintar();
    }
}