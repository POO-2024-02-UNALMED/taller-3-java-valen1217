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
