class Maintenance:
    def __init__(self, employee_in_charge, animal_id, process_performed, process_date, observations=""):
        self._employee_in_charge = employee_in_charge
        self._animal_id = animal_id
        self._process_performed = process_performed
        self._process_date = process_date
        self._observations = observations

    
    def get_employee_in_charge(self):
        return self._employee_in_charge

    def set_employee_in_charge(self, value):
        self._employee_in_charge = value

    def get_animal_id(self):
        return self._animal_id

    def set_animal_id(self, value):
        self._animal_id = value

    def get_process_performed(self):
        return self._process_performed

    def set_process_performed(self, value):
        self._process_performed = value

    def get_process_date(self):
        return self._process_date

    def set_process_date(self, value):
        self._process_date = value

    def get_observations(self):
        return self._observations

    def set_observations(self, value):
        self._observations = value