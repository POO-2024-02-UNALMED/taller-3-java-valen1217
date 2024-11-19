class Control:
    def _init_(self):
        self.__tv = None

    def enlazar(self, televisor):
        self.__tv = televisor
        televisor.setControl(self)

    def getTv(self):
        return self.__tv

    def setTv(self, televisor):
        self.__tv = televisor

    def turnOn(self):
        if self.__tv:
            self.__tv.turnOn()

    def turnOff(self):
        if self.__tv:
            self.__tv.turnOff()

    def canalUp(self):
        if self.__tv:
            self.__tv.canalUp()

    def canalDown(self):
        if self.__tv:
            self.__tv.canalDown()

    def volumenUp(self):
        if self.__tv:
            self.__tv.volumenUp()

    def volumenDown(self):
        if self.__tv:
            self.__tv.volumenDown()

    def setCanal(self, canal):
        if self.__tv:
            self.__tv.setCanal(canal)

class Marca:
    def _init_(self, nombre):
        self.__nombre = nombre

    def getNombre(self):
        return self.__nombre

    def setNombre(self, nuevoNombre):
        self.__nombre = nuevoNombre


class TV:
    numTV = 0

    def _init_(self, marca, encendido):
        self.__marca = marca
        self.__canal = 1
        self.__precio = 500
        self.__volumen = 1
        self.__estado = encendido
        self.__control = None
        TV.numTV += 1

    def getMarca(self):
        return self.__marca

    def setMarca(self, marcaNueva):
        self.__marca = marcaNueva

    def getCanal(self):
        return self.__canal

    def setCanal(self, nuevoCanal):
        if self.__estado and 1 <= nuevoCanal <= 120:
            self.__canal = nuevoCanal

    def getPrecio(self):
        return self.__precio

    def setPrecio(self, precioNuevo):
        self.__precio = precioNuevo

    def getVolumen(self):
        return self.__volumen

    def setVolumen(self, nuevoVolumen):
        if self.__estado and 0 <= nuevoVolumen <= 7:
            self.__volumen = nuevoVolumen

    def getControl(self):
        return self.__control

    def setControl(self, controlNuevo):
        self.__control = controlNuevo

    @staticmethod
    def getNumTV():
        return TV.numTV

    @staticmethod
    def setNumTV(cantidad):
        TV.numTV = cantidad

    def turnOn(self):
        self.__estado = True

    def turnOff(self):
        self.__estado = False

    def getEstado(self):
        return self.__estado

    def canalUp(self):
        if self._estado and self._canal < 120:
            self.__canal += 1

    def canalDown(self):
        if self._estado and self._canal > 1:
            self.__canal -= 1

    def volumenUp(self):
        if self._estado and self._volumen < 7:
            self.__volumen += 1

    def volumenDown(self):
        if self._estado and self._volumen > 0:
            self.__volumen -= 1