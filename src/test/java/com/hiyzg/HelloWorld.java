package com.hiyzg;

import org.junit.Test;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

/**
 * Created by Sam on 2019/3/14.
 */
public class HelloWorld {
    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void m() {
        try {
            Thread.sleep((long)(Math.random() * 100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void startup() throws RunnerException {
        Options opt = new OptionsBuilder()
                .include("HelloWorld")
                .exclude("Pref")
                .warmupIterations(10)
                .measurementIterations(10)
                .forks(3)
                .build();
        new Runner(opt).run();
    }
}
