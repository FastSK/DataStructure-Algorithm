import cProfile


def a():
    b()
    b()


def b():
    for i in range(250000): # iterate 250,000 numbers
        pass


profiler = cProfile.Profile()
profiler.enable()

a()

profiler.disable()
profiler.dump_stats("example.stats")
