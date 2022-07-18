import numpy

def solution(nums):
    npnums = numpy.array(nums)
    unique_ponkemon = len(numpy.unique(npnums))
    choice_chance = len(nums)/2
    if unique_ponkemon > choice_chance:
        return choice_chance
    else:
        return unique_ponkemon


