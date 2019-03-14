package com.hiyzg;

import org.junit.Test;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

/**
 * Created by Sam on 2019/3/14.
 */
public class CountPerf {
    @Benchmark
    @Fork(1)
    @BenchmarkMode(Mode.Throughput)
    public void countAsc() {
        for (int i = 0; i < 1_000_000; i++) {
            double random = Math.random();
        }
    }

    @Benchmark
    @Fork(1)
    @BenchmarkMode(Mode.Throughput)
    public void countDesc() {
        for (int i = 1_000_000; i > 0; i--) {
            double random = Math.random();
        }
    }

    @Test
    public void startup() throws RunnerException {
        Options opt = new OptionsBuilder()
                .include("Perf")
                .exclude("HelloWorld")
                .warmupIterations(10)
                .measurementIterations(10)
//                .forks(1)
                .build();

        new Runner(opt).run();
    }
}
