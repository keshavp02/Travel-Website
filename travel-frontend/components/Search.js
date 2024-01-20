"use client"

// Import React and Chakra UI components
import React, { useState } from 'react';
import {
    Box,
    Heading,
    Input,
    Button,
    Flex,
    FormControl,
    FormLabel,
    ChakraProvider,
} from '@chakra-ui/react';
import Select from 'react-select';

const Home = () => {
    const [formData, setFormData] = useState({
        destination: '',
        fromDate: '',
        toDate: '',
        adults: 1,
        children: 0,
    });

    const handleSubmit = (e) => {
        e.preventDefault();
        //display vacation packages
        console.log('Form Data:', formData);

    };

    const currentDate = new Date().toISOString().split('T')[0]; // Get current date in YYYY-MM-DD format

    return (
        <ChakraProvider>
            <Flex
                justify="center"
                align="center"
                h="100vh"
                bgGradient="linear(to-r, teal.500, teal.300)"
            >
                <Box
                    p={8}
                    width="1200px"
                    bg="white"
                    rounded="lg"
                    shadow="lg"
                    textAlign="center"
                >
                    <Heading mb={4} fontSize="xl" color="teal.500">
                        Vacation Package
                    </Heading>

                    <Flex justify="space-between">
                        {/* Destination */}
                        <FormControl mb={4} flexBasis="28%">
                            <FormLabel color="teal.500">Destination:</FormLabel>
                            <Select
                                value={formData.destination}
                                onChange={(selectedOption) =>
                                    setFormData({ ...formData, destination: selectedOption.value })
                                }
                                options={[
                                    { value: 'Paris', label: 'Paris' },
                                    { value: 'London', label: 'London' },
                                    { value: 'New York', label: 'New York' },
                                    { value: 'Tokyo', label: 'Tokyo' },
                                ]}
                            />
                        </FormControl>

                        {/* From Date */}
                        <FormControl mb={4} flexBasis="18%">
                            <FormLabel color="teal.500">From Date:</FormLabel>
                            <Input
                                type="date"
                                value={formData.fromDate}
                                onChange={(e) =>
                                    setFormData({
                                        ...formData,
                                        fromDate: e.target.value,
                                        toDate: e.target.value,
                                    })
                                }
                                min={currentDate}
                            />
                        </FormControl>

                        {/* To Date */}
                        <FormControl mb={4} flexBasis="18%">
                            <FormLabel color="teal.500">To Date:</FormLabel>
                            <Input
                                type="date"
                                value={formData.toDate}
                                onChange={(e) => setFormData({ ...formData, toDate: e.target.value })}
                                min={currentDate}
                            />
                        </FormControl>

                        {/* Number of Adults */}
                        <FormControl mb={4} flexBasis="18%">
                            <FormLabel color="teal.500">Number of Adults:</FormLabel>
                            <Input
                                type="number"
                                value={formData.adults}
                                onChange={(e) =>
                                    setFormData({
                                        ...formData,
                                        adults: Math.min(4, Math.max(0, e.target.value)),
                                    })
                                }
                                min={0}
                                max={4}
                            />
                        </FormControl>

                        {/* Number of Children */}
                        <FormControl mb={4} flexBasis="18%">
                            <FormLabel color="teal.500">Number of Children:</FormLabel>
                            <Input
                                type="number"
                                value={formData.children}
                                onChange={(e) =>
                                    setFormData({
                                        ...formData,
                                        children: Math.min(4, Math.max(0, e.target.value)),
                                    })
                                }
                                min={0}
                                max={4}
                            />
                        </FormControl>
                    </Flex>

                    <Button
                        colorScheme="teal"
                        onClick={handleSubmit}
                        mt={4}
                        bg="teal.500"
                        color="white"
                        _hover={{ bg: 'teal.600' }}
                    >
                        Search Vacation Packages
                    </Button>
                </Box>
            </Flex>
        </ChakraProvider>
    );
};

export default Home;
