from person import Person

class Employee(Person):
    def __init__(self, name, last_name, birth_date, hire_date, rfc, curp, salary, schedule, role):
        super().__init__(name, last_name, birth_date, curp)
        self._hire_date = hire_date
        self._rfc = rfc
        self._salary = salary
        self._schedule = schedule
        self._role = role

    
    def get_hire_date(self):
        return self._hire_date

    def set_hire_date(self, value):
        self._hire_date = value

    def get_rfc(self):
        return self._rfc

    def set_rfc(self, value):
        self._rfc = value

    def get_salary(self):
        return self._salary

    def set_salary(self, value):
        self._salary = value

    def get_schedule(self):
        return self._schedule

    def set_schedule(self, value):
        self._schedule = value

    def get_role(self):
        return self._role

    def set_role(self, value):
        self._role = value