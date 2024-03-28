from datetime import datetime

class Animal:
    def __init__(self, animal_type, birth_date, arrival_date, weight, diseases=[], feeding_frequency="", feeding_type="", vaccinated=False):
        self._animal_type = animal_type
        self._birth_date = birth_date
        self._arrival_date = arrival_date
        self._weight = weight
        self._diseases = diseases
        self._feeding_frequency = feeding_frequency
        self._feeding_type = feeding_type
        self._vaccinated = vaccinated

    def get_animal_type(self):
        return self._animal_type

    def set_animal_type(self, value):
        self._animal_type = value

    def get_birth_date(self):
        return self._birth_date

    def set_birth_date(self, value):
        self._birth_date = value

    def get_arrival_date(self):
        return self._arrival_date

    def set_arrival_date(self, value):
        self._arrival_date = value

    def get_weight(self):
        return self._weight

    def set_weight(self, value):
        self._weight = value

    def get_diseases(self):
        return self._diseases

    def set_diseases(self, value):
        self._diseases = value

    def get_feeding_frequency(self):
        return self._feeding_frequency

    def set_feeding_frequency(self, value):
        self._feeding_frequency = value

    def get_feeding_type(self):
        return self._feeding_type

    def set_feeding_type(self, value):
        self._feeding_type = value

    def is_vaccinated(self):
        return self._vaccinated

    def set_vaccinated(self, value):
        self._vaccinated = value