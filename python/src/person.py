from datetime import datetime

class Person:
    def __init__(self, name, last_name, birth_date, curp):
        self._name = name
        self._last_name = last_name
        self._birth_date = birth_date
        self._curp = curp

    def get_name(self):
        return self._name

    def set_name(self, value):
        self._name = value

    def get_last_name(self):
        return self._last_name

    def set_last_name(self, value):
        self._last_name = value

    def get_birth_date(self):
        return self._birth_date

    def set_birth_date(self, value):
        self._birth_date = value

    def get_curp(self):
        return self._curp

    def set_curp(self, value):
        self._curp = value


    def age(self):
        today = datetime.now()
        age = today.year - self._birth_date.year - ((today.month, today.day) < (self._birth_date.month, self._birth_date.day))
        return age
